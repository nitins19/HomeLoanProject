import { TestBed } from '@angular/core/testing';

import { SalariedService } from './salaried.service';

describe('SalariedService', () => {
  let service: SalariedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SalariedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
