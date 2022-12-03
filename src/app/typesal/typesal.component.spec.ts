import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TypesalComponent } from './typesal.component';

describe('TypesalComponent', () => {
  let component: TypesalComponent;
  let fixture: ComponentFixture<TypesalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TypesalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TypesalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
