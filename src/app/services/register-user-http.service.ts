import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../register-user/User';

@Injectable({
  providedIn: 'root'
})
export class RegisterUserHttpService {

  baseUrl = "http://localhost:8090/homeloanapp";
  constructor(private http: HttpClient) { }


  public registerUser(user: User) {
    return this.http.post<any>(this.baseUrl + '/adduser', user);
  }

  public getUserbyId(userId: number) {
    let u2 = (sessionStorage.getItem("userId"));
    return this.http.get(this.baseUrl + '/' + u2);
  }

}
