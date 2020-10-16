SELECT name, lastname FROM database.teacher WHERE subject IN (SELECT class FROM database.pupil WHERE name="giorgi");





