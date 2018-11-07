-- 查询一个表的所有信息
SELECT * from student

-- 查询去掉重复的记录
SELECT DISTINCT uname from student

-- 查询重新命名列
SELECT uname AS 'hahah' from student

-- 查询时候直接进行计算
SELECT uid+1000 FROM student

-- 查询加条件
SELECT * FROM student WHERE uid = 5
SELECT * FROM student WHERE umoney > 6000
SELECT * FROM student WHERE umoney > 6000 AND umoney < 10000

-- between的条件查询
SELECT * FROM student WHERE umoney BETWEEN 6000 AND 10000

-- in 查询金额是3500 4500 5500 其中一个
SELECT * FROM student WHERE umoney in (3500,4500,5500)

-- like 模糊查询
SELECT * FROM student WHERE uname LIKE '%s%'

-- _查询五个字符的
SELECT * FROM student WHERE uname like '____'

-- 查询不为空的
SELECT * FROM student WHERE umoney IS NOT NULL

-- 升序排列
SELECT * FROM student ORDER BY umoney

-- 降序排列
SELECT * FROM student ORDER BY umoney DESC
