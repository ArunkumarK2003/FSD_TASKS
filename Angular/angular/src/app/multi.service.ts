import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiService {
  getMulti(a:number,b:number){
    return a*b;
  }
}
