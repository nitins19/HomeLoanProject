import { User } from "../register-user/User";

export class SelfEmployed {
    srNo: number = 0;
    income: number = 0;
    typeOfWork: string = "";
    user: User;
    constructor(srNo: number, income: number, typeOfWork: string, user: User) {

        this.srNo = srNo;
        this.income = income;
        this.typeOfWork = typeOfWork;
        this.user = user;
    }
}