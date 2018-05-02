function del(btn) {
  let id = btn.id;
  $.get(
    "http://localhost:8080/DeleteById?id=" + id
  );
  window.location.reload();
}

function cre(btn) {
  let id = $("#book_id").val();
  let name = $("#book_name").val();
  let author = $("#book_author").val();
  let publish = $("#book_publish").val();
  let pic_path = $("#book_pic_path").val();
  let borrow_time = $("#book_borrow_time").val();
  let price = $("#book_price").val();
  let address = $("#book_address").val();
  let shelf = $("#book_shelf").val();
  let type = $("#book_type").val();
  let state = $("#book_state").val();
  $.get(
    "http://localhost:8080/NewBook?" +
    "id=" + id + "&name=" + name + "&author=" + author + "&publish=" + publish +
    "&type=" + type + "&shelf=" + shelf + "&address=" + address + "&pic_path=" + pic_path + "&borrow_time=" + borrow_time
    + "&price=" + price + "&state=" + state
  );
  window.location.reload();
}

function update(btn) {
  let id = $("#book_new_id"+btn.id).val();
  let name = $("#book_new_name"+btn.id).val();
  let author = $("#book_new_author"+btn.id).val();
  let publish = $("#book_new_publish"+btn.id).val();
  let pic_path = $("#book_new_pic_path"+btn.id).val();
  let borrow_time = $("#book_new_borrow_time"+btn.id).val();
  let price = $("#book_new_price"+btn.id).val();
  let address = $("#book_new_address"+btn.id).val();
  let shelf = $("#book_new_shelf"+btn.id).val();
  let type = $("#book_new_type"+btn.id).val();
  let state = $("#book_new_state"+btn.id).val();
  if (state == "在库")
    state = 0;
  else
    state = 1;
  $.get(
    "http://localhost:8080/Update?" +
    "id=" + id + "&name=" + name + "&author=" + author + "&publish=" + publish +
    "&type=" + type + "&shelf=" + shelf + "&address=" + address + "&pic_path=" + pic_path + "&borrow_time=" + borrow_time
    + "&price=" + price + "&state=" + state
  );
  window.location.reload();
}

