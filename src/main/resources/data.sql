
insert into customer(id, created_at, email, name, phone)
values(null, '2024-09-04 23:14:07.000000', 'customer1@email.com', 'customer1', '01723987658');

insert into customer(id, created_at, email, name, phone)
values(null, '2024-09-04 23:14:07.000000', 'customer2@email.com', 'customer2', '01723987658');

insert into customer(id, created_at, email, name, phone)
values(null, '2024-09-04 23:14:07.000000', 'customer3@email.com', 'customer3', '01723987348');

insert into product(id, created_at, product_description, product_name, product_price)
values(null, '2024-09-05 23:14:07.000000', 'product1 has 2 varities', 'product1', 108.50);

insert into product(id, created_at, product_description, product_name, product_price)
values(null, '2024-09-06 23:14:07.000000', 'product2 is a good product', 'product2', 45.00);

insert into product(id, created_at, product_description, product_name, product_price)
values(null, '2024-09-05 23:14:07.000000', 'product3 has 4 varities', 'product3', 50.00);

insert into product(id, created_at, product_description, product_name, product_price)
values(null, '2024-09-05 23:14:07.000000', 'product4 is a household', 'product4', 200);

insert into product(id, created_at, product_description, product_name, product_price)
values(null, '2024-09-05 23:14:07.000000', 'product5 has 2 varities', 'product5', 80.00);

insert into wishlist(id, created_at, customer_id) values(null, '2024-09-03 23:14:07.000000', 1);
insert into wishlist(id, created_at, customer_id) values(null, '2024-09-03 23:14:07.000000', 2);
insert into wishlist(id, created_at, customer_id) values(null, '2024-09-03 23:14:07.000000', 3);

insert into wish_item(id, updated_at, product_id, wish_list_id) values(null, '2024-09-05 23:14:07.000000', 1, 1);
insert into wish_item(id, updated_at, product_id, wish_list_id) values(null, '2024-09-05 23:14:07.000000', 2, 1);
insert into wish_item(id, updated_at, product_id, wish_list_id) values(null, '2024-09-05 23:14:07.000000', 3, 1);

insert into sale(id, quantity, sale_date, customer_id, product_id, total_price)
values (null, 1, '2024-08-05 23:14:07.000000', 1, 1, 108.50);

insert into sale(id, quantity, sale_date, customer_id, product_id, total_price)
values (null, 2, '2024-08-15 23:14:07.000000', 2, 3, 100.00);

insert into sale(id, quantity, sale_date, customer_id, product_id, total_price)
values (null, 1, '2024-08-025 23:14:07.000000', 3, 1, 108.50);

insert into sale(id, quantity, sale_date, customer_id, product_id, total_price)
values (null, 2, '2024-08-20 23:14:07.000000', 2, 4, 400);

insert into sale(id, quantity, sale_date, customer_id, product_id, total_price)
values (null, 1, '2024-08-05 23:14:07.000000', 1, 5, 80.00);