import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Account } from '../admindashboard/Account';
import { Application } from '../admindashboard/Application';

@Injectable({
  providedIn: 'root'
})
export class AdminApplicationService {

  baseurl: string = "http://localhost:8090/admin";


  constructor(private httpSer: HttpClient) { }

  public getApplicationList() {
    return this.httpSer.get<Application[]>(this.baseurl + "/allapplns");
  }



  public updateApplication(applicationId: number, status: string) {
    return this.httpSer.put(this.baseurl + "/updatestatus/" + applicationId + "/" + status, {});
  }


  public getApplicationListByStatus(status: string) {
    return this.httpSer.get<Application[]>(this.baseurl + "/get-application-by-status/" + status);
  }


  public generateAccount(account: Account) {
    return this.httpSer.post<any>(this.baseurl + '/add-account', account);
  }

}