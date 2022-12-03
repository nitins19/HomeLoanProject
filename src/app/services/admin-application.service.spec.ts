import { TestBed } from '@angular/core/testing';

import { AdminApplicationService } from './admin-application.service';

describe('AdminApplicationService', () => {
  let service: AdminApplicationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminApplicationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
