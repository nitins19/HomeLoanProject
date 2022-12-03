import { User } from "../register-user/User";

export class Property {
    propertyId: number = 0;
    propertyName: string = "";
    propertyLocation: string = "";
    amount: number = 0;
    user: User;
    constructor(propertyId: number, propertyName: string, propertyLocation: string, amount: number, user: User) {

        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.propertyLocation = propertyLocation;
        this.amount = amount;
        this.user = user;
    }
}