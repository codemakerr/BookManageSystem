import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookOperateComponent } from './book-operate.component';

describe('BookOperateComponent', () => {
  let component: BookOperateComponent;
  let fixture: ComponentFixture<BookOperateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookOperateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookOperateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
