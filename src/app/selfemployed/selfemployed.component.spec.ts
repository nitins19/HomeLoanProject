import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelfemployedComponent } from './selfemployed.component';

describe('SelfemployedComponent', () => {
  let component: SelfemployedComponent;
  let fixture: ComponentFixture<SelfemployedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelfemployedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SelfemployedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
