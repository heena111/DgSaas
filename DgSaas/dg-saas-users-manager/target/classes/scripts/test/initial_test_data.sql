insert into dg_saas_data_platforms(id,data_platform) values (1, 'Hadoop');
insert into dg_saas_data_platforms(id,data_platform) values (2, 'RDBMS');
insert into dg_saas_data_platforms(id,data_platform) values (3, 'Files');

insert into dg_saas_data_solutions(id,data_solution) values (1, 'Detection');
insert into dg_saas_data_solutions(id,data_solution) values (2, 'Protection');


insert into dg_saas_restricted_domains(id,domain_name,needs_approval,createts,updatets) values (1, 'gmail', false, CURRENT TIMESTAMP, CURRENT TIMESTAMP);
insert into dg_saas_restricted_domains(id,domain_name,needs_approval,createts,updatets) values (2, 'yahoo', false, CURRENT TIMESTAMP, CURRENT TIMESTAMP);


insert into dg_saas_restricted_emails(id,email_address,restriction_type,createts,updatets) values (1, 'dennis0003@aa.com','A', CURRENT TIMESTAMP, CURRENT TIMESTAMP);
insert into dg_saas_restricted_emails(id,email_address,restriction_type,createts,updatets) values (2, 'test@test.com','A', CURRENT TIMESTAMP, CURRENT TIMESTAMP);