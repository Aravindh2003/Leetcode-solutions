(SELECT u.name as results FROM MovieRating m
INNER JOIN Users u ON u.user_id = m.user_id
GROUP BY m.user_id
ORDER BY COUNT(*) DESC, u.name ASC
LIMIT 1)
UNION ALL
(SELECT A.title FROM MovieRating x
INNER JOIN Movies A ON A.movie_id = x.movie_id
WHERE x.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY x.movie_id
ORDER BY AVG(x.rating) DESC, A.title ASC
LIMIT 1);
