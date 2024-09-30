SELECT view_name, text
FROM all_views
WHERE owner = 'ART';

SELECT object_name, object_type
FROM all_objects
WHERE object_type = 'PROCEDURE' AND owner = 'ART';

SELECT object_name, object_type
FROM all_objects
WHERE object_type = 'FUNCTION' AND owner = 'ART';


SELECT trigger_name, table_name
FROM all_triggers
WHERE owner = 'ART';