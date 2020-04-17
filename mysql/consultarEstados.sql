
use wn;
select * from estados;

select 
nome as 'Nome do Estado',sigla 
from estados;

select 
sigla, nome as 'Nome do Estado' 
from estados
where regiao = 'sul';

select 
nome,regiao,populacao 
from estados
where populacao >= 10
order by populacao desc ;