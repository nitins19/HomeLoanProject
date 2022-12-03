import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Application } from '../admindashboard/Application';
import { UserLogin } from '../Login/userlogin/UserLogin';

@Injectable({
  providedIn: 'root'
})
export class UserloginService {
  constructor(private http: HttpClient) { }

  private baseUrl = "http://localhost:8090/homeloanapp"


  public userlogin(user: UserLogin): Observable<any> {
    console.log(user)
    return this.http.post<any>(this.baseUrl + "/userlogin", user);

  }

  public getApplicationById(userId: number) {
    return this.http.get<Application[]>(this.baseUrl + "/getapplicationby-userId/" + userId);
  }

  public getaccountdetails(appId: number) {
    return this.http.get(this.baseUrl + "/getaccdet/" + appId);
  }

}
