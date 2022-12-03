import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SelfemployedService {
  baseURL: string = "http://localhost:8090/homeloanapp";


  constructor(private httpSer: HttpClient) {

  }

  public AddSelfEmpInfo(selfEmployed: any) {
    return this.httpSer.post<any>(this.baseURL + '/addselfemp', selfEmployed);
  }
}
