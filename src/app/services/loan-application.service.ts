import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoanApplication } from '../loan-application/LoanApplication';

@Injectable({
  providedIn: 'root'
})
export class LoanApplicationService {

  baseUrl = "http://localhost:8090/homeloanapp"

  constructor(private http: HttpClient) { }

  public addLoanInfo(appln: LoanApplication) {
    return this.http.post<any>(this.baseUrl + '/addloanappdet', appln);
  }



}
