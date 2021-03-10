create index IX_ACACB38F on _Talk (startDate);
create index IX_F0FB3E65 on _Talk (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E89A1A27 on _Talk (uuid_[$COLUMN_LENGTH:75$], groupId);