import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Salaried } from '../salaried/Salaried';

@Injectable({
  providedIn: 'root'
})
export class SalariedService {

  baseURL: string = "http://localhost:8090/homeloanapp";
  constructor(private httpSer: HttpClient) { }


  public AddSalariedInfo(salaried: Salaried) {
    return this.httpSer.post<any>(this.baseURL + '/addsalaried', salaried);
  }
}
