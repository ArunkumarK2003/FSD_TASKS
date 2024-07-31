import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AngulService {
  getAddition(a:number,b:number){
    return a+b;
  }
  getSubtraction(a:number,b:number){
    return a-b;
  }
}
