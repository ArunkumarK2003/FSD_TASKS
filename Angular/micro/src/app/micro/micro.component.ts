import { Component } from '@angular/core';

@Component({
  selector: 'app-micro',
  templateUrl: './micro.component.html',
  styleUrls: ['./micro.component.css']
})
export class MicroComponent {
  PlateNo: string;
  durationIn: string;
  durationOut: string;
  phoneNo: string;
  colorOfTheCar: string;

  constructor() {
    this.PlateNo = "TN39AV0066";
    this.phoneNo = "9123456780";
    this.durationIn = "10";
    this.durationOut = "20";
    this.colorOfTheCar = "neon";
  }

  entry() {
    alert("Please park at Slot 2 and floor 1");
  }

  clear() {
    this.PlateNo = "";
    this.phoneNo = "";
    this.durationIn = "";
    this.durationOut = "";
    this.colorOfTheCar = "";  }
}