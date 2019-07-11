-- 查询模板
SELECT
	*
FROM
	`template`
WHERE
	type = '1';

-- 查询属性
SELECT
	*
FROM
	properties
WHERE
	tid = '1';
-- 查询属性
SELECT
	*
FROM
	properties p
	LEFT JOIN pvalue v ON p.pid = v.pid
WHERE
	p.STATUS = '1';
SELECT
	*
FROM
	properties p1
	LEFT JOIN properties p2 ON p1.pid = p2.parent_pid
WHERE
	p1.parent_pid = '0';

-- 查询所有
SELECT
  v2.pid,
	v2.vid,
	CONCAT( p1.pid, ':', v1.vid, ',', p2.pid, ':', v2.vid ) AS path,
	CONCAT( p1.NAME, ':', v1.NAME, ',', p2.NAME, ':', v2.NAME ) AS pathname
FROM
	properties p1
	LEFT JOIN pvalue v1 ON p1.pid = v1.pid
	LEFT JOIN properties p2 ON p2.parent_vid = v1.vid
	LEFT JOIN pvalue v2 ON p2.pid = v2.pid
WHERE
	p1.parent_pid = '0'
	AND p1.parent_vid = '0';