select p.product_id,IFNULL(Round(sum(p.price*u.units)/sum(u.units),2),0) as average_price from Prices p
Left join UnitsSold u
on p.product_id = u.product_id 
and u.purchase_date >= p.start_date
and u.purchase_date <= p.end_date
group by product_id;