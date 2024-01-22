select person_name
from(
  select person_name, sum(Weight) over (order by turn) as Total_Weight
  from Queue
) as p
where Total_Weight<=1000
order by Total_Weight desc limit 1;
