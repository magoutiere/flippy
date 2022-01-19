import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Flip} from "../models/Flip";

@Injectable({
  providedIn: 'root'
})
export class FlipService {

  constructor(private http: HttpClient) {
  }

  getFlips() {
    return this.http.get<Array<Flip>>('/api/flip')
  }

  updateFlip(flip: Flip) {
    return this.http.post('/api/flip', flip);
  }
}
