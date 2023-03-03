import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AltaEmprendedoresComponent } from './alta-emprendedores.component';

describe('AltaEmprendedoresComponent', () => {
  let component: AltaEmprendedoresComponent;
  let fixture: ComponentFixture<AltaEmprendedoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AltaEmprendedoresComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AltaEmprendedoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
