-- RESERVATION
INSERT INTO reservations (ID, RESERVATION_NAME, DATE_FROM, DATE_TO)
VALUES
  (1, 'res1', ParseDateTime('01 01 2001', 'd M yyyy'), ParseDateTime('02 01 2001', 'd M yyyy')),
  (2, 'res1', ParseDateTime('01 02 2001', 'd M yyyy'), ParseDateTime('02 02 2001', 'd M yyyy')),
  (3, 'res3', ParseDateTime('01 03 2001', 'd M yyyy'), ParseDateTime('02 03 2001', 'd M yyyy')),
  (4, 'res4', ParseDateTime('01 04 2001', 'd M yyyy'), ParseDateTime('02 04 2001', 'd M yyyy')),
  (5, 'res5', ParseDateTime('01 05 2001', 'd M yyyy'), ParseDateTime('02 05 2001', 'd M yyyy'));

INSERT INTO apartments (ID, APARTMENT_NR, ROOM_COUNT)
VALUES
  (1, 01, 5),
  (2, 02, 5),
  (3, 03, 2),
  (4, 04, 2),
  (5, 05, 6);

-- RESERVATION
INSERT INTO reserved_apartments (ID, res_id, apart_id, )
VALUES
  (1, 'res1', ParseDateTime('01 01 2001', 'd M yyyy'), ParseDateTime('02 01 2001', 'd M yyyy')),
  (2, 'res1', ParseDateTime('01 02 2001', 'd M yyyy'), ParseDateTime('02 02 2001', 'd M yyyy')),
  (3, 'res3', ParseDateTime('01 03 2001', 'd M yyyy'), ParseDateTime('02 03 2001', 'd M yyyy')),
  (4, 'res4', ParseDateTime('01 04 2001', 'd M yyyy'), ParseDateTime('02 04 2001', 'd M yyyy')),
  (5, 'res5', ParseDateTime('01 05 2001', 'd M yyyy'), ParseDateTime('02 05 2001', 'd M yyyy'));