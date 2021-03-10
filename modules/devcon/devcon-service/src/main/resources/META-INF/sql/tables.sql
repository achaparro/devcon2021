create table _Talk (
	uuid_ VARCHAR(75) null,
	talkId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	speaker VARCHAR(75) null,
	description VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null
);