import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PropertyService } from '../services/property.service';
@Component({
  selector: 'app-property',
  templateUrl: './property.component.html',
  styleUrls: ['./property.component.css']
})
export class PropertyComponent implements OnInit {

  propertyForm !: FormGroup;
  property: any;
  u1: any;
  constructor(private propertySer: PropertyService, private fb: FormBuilder, private router: Router) {

  }

  ngOnInit(): void {

    this.u1 = sessionStorage.getItem('userId');
    let obj = JSON.parse(this.u1);
    console.log(obj);
    console.log(obj.userId);
    this.propertyForm = this.fb.group({
      propertyName: ["", Validators.required],
      propertyLocation: ["", Validators.required],
      amount: [0, Validators.required],
      user: [obj]
    });
  }

  onSubmit() {
    this.propertySer.addPropertyDetails(this.propertyForm.value).subscribe(
      Response => {
        console.log("property record added");
        this.property = Response;
        console.log(this.property);
        this.router.navigate(['/loanapplication'])
      }
    )
  }

}