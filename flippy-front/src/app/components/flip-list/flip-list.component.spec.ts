import {ComponentFixture, TestBed} from '@angular/core/testing';

import {FlipListComponent} from './flip-list.component';

describe('FlipListComponent', () => {
  let component: FlipListComponent;
  let fixture: ComponentFixture<FlipListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FlipListComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FlipListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
