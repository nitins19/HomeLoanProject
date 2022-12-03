import { TestBed } from '@angular/core/testing';

import { SelfemployedService } from './selfemployed.service';

describe('SelfemployedService', () => {
  let service: SelfemployedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SelfemployedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
