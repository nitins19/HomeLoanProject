import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminloginComponent } from './Login/adminlogin/adminlogin.component';
import { UserloginComponent } from './Login/userlogin/userlogin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { RegisterUserComponent } from './register-user/register-user.component';

import { EligibilityCalculatorComponent } from './calculators/eligibility-calculator/eligibility-calculator.component';
import { EmiCalculatorComponent } from './calculators/emi-calculator/emi-calculator.component';
import { SalariedComponent } from './salaried/salaried.component';
import { SelfemployedComponent } from './selfemployed/selfemployed.component';
import { PropertyComponent } from './property/property.component';
import { TypesalComponent } from './typesal/typesal.component';
import { LoanApplicationComponent } from './loan-application/loan-application.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { CreateAccountComponent } from './create-account/create-account.component';







@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    UserloginComponent,
    DashboardComponent,
    NavbarComponent,
    AdmindashboardComponent,
    AboutusComponent,
    RegisterUserComponent,
    EligibilityCalculatorComponent,
    EmiCalculatorComponent,
    SalariedComponent,
    SelfemployedComponent,
    PropertyComponent,
    TypesalComponent,
    LoanApplicationComponent,
    UserdashboardComponent,
    CreateAccountComponent,



  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule






  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
