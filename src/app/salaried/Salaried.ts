import { User } from "../register-user/User";

export class Salaried {
    srNo: number = 0;
    retirementAge: number = 0;
    monthlySalary: number = 0;
    organization: string = "";
    user: User;
    constructor(srNo: number, retirementAge: number, monthlySalary: number, organization: string, user: User) {

        this.srNo = srNo;
        this.retirementAge = retirementAge
        this.monthlySalary = monthlySalary;
        this.organization = organization;
        this.user = user;
    }
}