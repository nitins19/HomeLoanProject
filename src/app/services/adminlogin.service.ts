import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AdminLogin } from '../admin-login';

@Injectable({
  providedIn: 'root'
})
export class AdminloginService {

  constructor(private http: HttpClient) { }

  private baseUrl = "http://localhost:8090/admin"

  public loginAdmin(admin: AdminLogin): Observable<any> {
    console.log(admin)
    return this.http.post<any>(this.baseUrl + "/adminlogin", admin);

  }
}
