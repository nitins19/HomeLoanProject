import { JsonPipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../register-user/User';
import { RegisterUserHttpService } from '../services/register-user-http.service';
import { SalariedService } from '../services/salaried.service';
import { Salaried } from './Salaried';

@Component({
  selector: 'app-salaried',
  templateUrl: './salaried.component.html',
  styleUrls: ['./salaried.component.css']
})
export class SalariedComponent implements OnInit {

  salariedForm!: FormGroup;
  salaried: Salaried;
  u1: any;

  constructor(private salariedSer: SalariedService, private fb: FormBuilder, private router: Router, private regser: RegisterUserHttpService) { }

  ngOnInit(): void {
    this.u1 = sessionStorage.getItem('userId');
    let obj = JSON.parse(this.u1);
    console.log(obj);
    console.log(obj.userId);
    this.salariedForm = this.fb.group({
      retirementAge: ['', Validators.required],
      monthlySalary: ['', Validators.required],
      organization: ['', Validators.required],
      user: [obj]
    });
    console.log(this.salariedForm);
    // this.salariedForm.controls['USER_ID'].setValue(obj.userId);
  }

  onSubmit() {

    this.salariedSer.AddSalariedInfo(this.salariedForm.value).subscribe(
      Response => {
        console.log("Record added successfully!")
        this.salaried = Response;
        this.router.navigate(['/property']);
      }
    );

  }


}

