import { Component } from '@angular/core';

@Component({
  selector: 'app-micro',
  templateUrl: './micro.component.html',
  styleUrls: ['./micro.component.css']
})

export class MicroComponent {
  pla: string='';
  in: string='';
  out: string='';
  poh: string='';
  col: string=''; 

  dispal:string='';
  disin:string='';
  disout:string='';
  dispoh:string='';
  discol:string='';
  
  clear() {
    this.pla = "";
    this.poh = "";
    this.in = "";
    this.out = "";
    this.col = ""; 
  }
  
  disp(){
    this.dispal=this.pla;
    this.disin=this.in;
    this.disout=this.out;
    this.dispoh=this.poh;
    this.discol=this.col;
  }
}