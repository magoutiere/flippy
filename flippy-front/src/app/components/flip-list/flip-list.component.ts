import {Component, OnInit} from '@angular/core';
import {Flip} from "../../models/Flip";
import {FlipService} from "../../services/flip.service";

@Component({
  selector: 'app-flip-list',
  templateUrl: './flip-list.component.html',
  styleUrls: ['./flip-list.component.css']
})
export class FlipListComponent implements OnInit {
  flips: Array<Flip> = [];

  constructor(private flipService: FlipService) {
  }

  ngOnInit(): void {
    this.flipService.getFlips().subscribe(flips => this.flips = flips);
  }

  updateFlip(flip: Flip) {
    this.flipService.updateFlip({name: flip.name, state: !flip.state})
      .subscribe(() => console.log("flip updated"));
  }
}
