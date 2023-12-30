select name
from Employee
where id in (
select managerId 
from Employee 
group by managerId 
having COUNT(managerId)>=5)
