import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ErrorAutenticacionComponent } from './error-autenticacion.component';

describe('ErrorAutenticacionComponent', () => {
  let component: ErrorAutenticacionComponent;
  let fixture: ComponentFixture<ErrorAutenticacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ErrorAutenticacionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ErrorAutenticacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
