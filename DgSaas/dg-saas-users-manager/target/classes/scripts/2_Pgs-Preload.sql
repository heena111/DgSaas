-- PLEASE DO NOT DELETE OR COMMENT THE LINE BELOW
\connect dg;

set search_path=dgsaas;

Delete from dg_saas_data_platforms;
insert into dg_saas_data_platforms(id,data_platform) values (1, 'Hadoop');
insert into dg_saas_data_platforms(id,data_platform) values (2, 'RDBMS');
insert into dg_saas_data_platforms(id,data_platform) values (3, 'Files');

Delete from dg_saas_data_solutions;
insert into dg_saas_data_solutions(id,data_solution) values (1, 'Detection');
insert into dg_saas_data_solutions(id,data_solution) values (2, 'Protection');


Delete from dg_saas_restricted_domains;
insert into dg_saas_restricted_domains(id,domain_name,needs_approval,createts,updatets) values (1, 'gmail', false, now(), now());
insert into dg_saas_restricted_domains(id,domain_name,needs_approval,createts,updatets) values (2, 'yahoo', false, now(), now());


Delete from dg_saas_restricted_emails;
insert into dg_saas_restricted_emails(id,email_address,restriction_type,createts,updatets) values (1, 'dennis0003@aa.com','A', now(), now());
insert into dg_saas_restricted_emails(id,email_address,restriction_type,createts,updatets) values (2, 'test@test.com','A', now(), now());

commit;