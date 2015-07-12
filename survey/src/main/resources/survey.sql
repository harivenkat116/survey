CREATE USER SURVEY2015 IDENTIFIED BY SURVEY2015
 DEFAULT TABLESPACE USERS TEMPORARY TABLESPACE TEMP
  PROFILE DEFAULT ACCOUNT UNLOCK;

grant connect, resource to SURVEY2015;
GRANT SELECT_CATALOG_ROLE TO SURVEY2015;
GRANT CREATE VIEW TO SURVEY2015;
GRANT UNLIMITED TABLESPACE TO SURVEY2015;


                                                                                
  CREATE TABLE "SURVEY2015"."CLIENTS"                                           
   (	"COMPANY_ID" NUMBER(8,0),                                                  
	"COMPANY_NAME" VARCHAR2(30),                                                   
	"COMPANY_ADDRESS" VARCHAR2(100),                                               
	 CONSTRAINT "CLIENTS_PK" PRIMARY KEY ("COMPANY_ID")                            
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS             
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS"  ENABLE                                                    
   ) SEGMENT CREATION IMMEDIATE                                                 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING              

  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS";                                                         
                                                                                
                                                                                
                                                                                
  CREATE TABLE "SURVEY2015"."SURVEYEE_INFO"                                     
   (	"SURVEYEE_ID" NUMBER(8,0),                                                 
	"SURVEYEE_NAME" VARCHAR2(30),                                                  
	"COMPANY_ID" NUMBER(8,0),                                                      
	"DESK_NUMBER" VARCHAR2(8) NOT NULL ENABLE,                                     
	"PHONE_NUMBER" VARCHAR2(10),                                                   

	 CONSTRAINT "SURVEYEE_INFO_PK" PRIMARY KEY ("SURVEYEE_ID")                     
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS             
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS"  ENABLE,                                                   
	 CONSTRAINT "SURVEYEE_INFO_CLIENTS_FK" FOREIGN KEY ("COMPANY_ID")              
	  REFERENCES "SURVEY2015"."CLIENTS" ("COMPANY_ID") ENABLE                      
   ) SEGMENT CREATION IMMEDIATE                                                 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING              
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS";                                                           
                                                                                
                                                                                
                                                                                
  CREATE TABLE "SURVEY2015"."SURVEYS"                                           
   (	"SURVEY_DETAILS_ID" NUMBER(8,0),                                           
	"SURVEYEE_ID" NUMBER(8,0),                                                     
	"TECH_CATEGORY" VARCHAR2(20),                                                  
	"SOLVED_OR_NOT" VARCHAR2(1),                                                   
	"SOLUTION_DEGREE" VARCHAR2(1),                                                 
	"WILL_TO_HELP_RATING" VARCHAR2(1),                                             
	"COURTESY_RATING" VARCHAR2(1),                                                 
	 CONSTRAINT "SURVEYS_PK" PRIMARY KEY ("SURVEY_DETAILS_ID")                     

  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS             
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS"  ENABLE,                                                   
	 CONSTRAINT "SURVEYS_SURVEYEE_INFO_FK" FOREIGN KEY ("SURVEYEE_ID")             
	  REFERENCES "SURVEY2015"."SURVEYEE_INFO" ("SURVEYEE_ID") ON DELETE CASCADE ENA
BLE                                                                             
   ) SEGMENT CREATION IMMEDIATE                                                 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING              
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS";                                                           
                                                                                
                                                                                
                                                                                
  CREATE TABLE "SURVEY2015"."USERPWD"                                           
   (	"USER_NAME" VARCHAR2(30),                                                  
	"PASSWORD" VARCHAR2(8),                                                        
	"USER_TYPE" VARCHAR2(8)                                                        
   ) SEGMENT CREATION DEFERRED                                                  
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING              
  TABLESPACE "USERS";                                                           
                                                                                
                                                                                

                                                                                
  CREATE TABLE "SURVEY2015"."CLIENT_DESKS_PHONES"                               
   (	"COMPANY_ID" NUMBER(8,0),                                                  
	"DESK_NUMBER" VARCHAR2(8) NOT NULL ENABLE,                                     
	"PHONE_NUMBER" VARCHAR2(10),                                                   
	 CONSTRAINT "CLIENT_DESKS_PHONES_CLIENTS_FK" FOREIGN KEY ("COMPANY_ID")        
	  REFERENCES "SURVEY2015"."CLIENTS" ("COMPANY_ID") ENABLE                      
   ) SEGMENT CREATION IMMEDIATE                                                 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING              
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645         
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DE
FAULT CELL_FLASH_CACHE DEFAULT)                                                 
  TABLESPACE "USERS";                                                            