import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { EligibilityCalculatorComponent } from './calculators/eligibility-calculator/eligibility-calculator.component';
import { EmiCalculatorComponent } from './calculators/emi-calculator/emi-calculator.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoanApplicationComponent } from './loan-application/loan-application.component';
import { AdminloginComponent } from './Login/adminlogin/adminlogin.component';
import { UserloginComponent } from './Login/userlogin/userlogin.component';
import { PropertyComponent } from './property/property.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { SalariedComponent } from './salaried/salaried.component';
import { SelfemployedComponent } from './selfemployed/selfemployed.component';
import { TypesalComponent } from './typesal/typesal.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';




const routes: Routes = [
  { path: '', redirectTo: "dashboard", pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'userlogin', component: UserloginComponent },
  { path: 'admindashboard', component: AdmindashboardComponent },
  { path: 'aboutus', component: AboutusComponent },
  { path: 'userreg', component: RegisterUserComponent },
  { path: 'eligiblity', component: EligibilityCalculatorComponent },
  { path: 'emi', component: EmiCalculatorComponent },
  { path: 'typesal', component: TypesalComponent },
  { path: 'salaried', component: SalariedComponent },
  { path: 'selfemployed', component: SelfemployedComponent },
  { path: 'property', component: PropertyComponent },
  { path: 'loanapplication', component: LoanApplicationComponent },
  { path: 'userdashboard', component: UserdashboardComponent },
  { path: 'accountstatus', component: CreateAccountComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
