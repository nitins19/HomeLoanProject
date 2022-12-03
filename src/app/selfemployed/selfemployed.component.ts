import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SelfemployedService } from '../services/selfemployed.service';

@Component({
  selector: 'app-selfemployed',
  templateUrl: './selfemployed.component.html',
  styleUrls: ['./selfemployed.component.css']
})
export class SelfemployedComponent implements OnInit {

  selfEmployedForm!: FormGroup;
  selfEmployed: any;
  userId: any;

  constructor(private selfEmployedSer: SelfemployedService, private fb: FormBuilder,
    private router: Router) { }
  u1: any;
  ngOnInit(): void {

    this.u1 = sessionStorage.getItem('userId');
    let obj = JSON.parse(this.u1);
    console.log(obj);
    console.log(obj.userId);
    this.selfEmployedForm = this.fb.group({
      income: ['', Validators.required],
      typeofwork: ["", Validators.required],
      user: [obj]
    });
  }

  onSubmit() {

    this.selfEmployedSer.AddSelfEmpInfo(this.selfEmployedForm.value).subscribe(
      Response => {
        console.log("record addded");
        this.selfEmployed = Response;
        console.log(this.selfEmployed);
        this.router.navigate(['/property']);
      }
    );
  }

}

