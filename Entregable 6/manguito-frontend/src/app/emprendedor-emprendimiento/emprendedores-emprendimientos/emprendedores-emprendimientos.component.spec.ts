import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmprendedoresEmprendimientosComponent } from './emprendedores-emprendimientos.component';

describe('EmprendedoresEmprendimientosComponent', () => {
  let component: EmprendedoresEmprendimientosComponent;
  let fixture: ComponentFixture<EmprendedoresEmprendimientosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmprendedoresEmprendimientosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmprendedoresEmprendimientosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
