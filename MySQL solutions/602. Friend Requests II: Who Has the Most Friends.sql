WITH ids AS (
  SELECT requester_id AS id FROM RequestAccepted
  UNION ALL
  SELECT accepter_id AS id FROM RequestAccepted
)
SELECT 
  id, 
  COUNT(1) AS num 
FROM ids
GROUP BY id
ORDER BY num DESC 
LIMIT 1;
