with cte1 as(Select customer_Id,name,visited_on, sum(amount) as amount,row_number() over(order by visited_on) as rw from customer group by visited_on),
cte2 as(Select visited_on,rw,sum(amount) OVER (ORDER BY rw ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS amount, AVG(amount) OVER (ORDER BY rw ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS average_amount from cte1)

Select visited_on,amount,ROUND(average_amount,2) as average_amount from cte2 where rw >= 7;
