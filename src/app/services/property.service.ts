import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Property } from '../property/Property';

@Injectable({
  providedIn: 'root'
})
export class PropertyService {
  baseURL: string = "http://localhost:8090/homeloanapp";
  constructor(private httpSer: HttpClient) { }

  public addPropertyDetails(property: Property) {
    return this.httpSer.post<any>(this.baseURL + "/addpropertydet", property);
  }
}