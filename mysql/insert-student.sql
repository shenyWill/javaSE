-- 给表中插入数据
INSERT INTO student (uname,uage) VALUES ('will','26')

-- 修改单行数据 
update student SET uname = 'yuan', uage = '28' WHERE uid = 1 or uid = 6

-- 删除单行数据
DELETE FROM student WHERE uid=6