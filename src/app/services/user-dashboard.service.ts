import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Application } from '../admindashboard/Application';

@Injectable({
  providedIn: 'root'
})
export class UserDashboardService {

  baseurl: string = "http://localhost:8090/admin";

  constructor(private httpSer: HttpClient) { }

  public getApplicationList() {
    return this.httpSer.get<Application[]>(this.baseurl + "/allapplns");
  }
}
