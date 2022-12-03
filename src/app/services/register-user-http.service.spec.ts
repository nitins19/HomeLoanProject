import { TestBed } from '@angular/core/testing';

import { RegisterUserHttpService } from './register-user-http.service';

describe('RegisterUserHttpService', () => {
  let service: RegisterUserHttpService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RegisterUserHttpService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
