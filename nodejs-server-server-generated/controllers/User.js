'use strict';

var utils = require('../utils/writer.js');
var User = require('../service/UserService');

module.exports.usersPOST = function usersPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  User.usersPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdBlockedGET = function usersUserIdBlockedGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdBlockedGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdCallsAnsweredGET = function usersUserIdCallsAnsweredGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdCallsAnsweredGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdCallsGET = function usersUserIdCallsGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdCallsGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdCallsNonansweredGET = function usersUserIdCallsNonansweredGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdCallsNonansweredGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdCheck_contacts_use_whatsAppPOST = function usersUserIdCheck_contacts_use_whatsAppPOST (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var returnUserInfo = req.swagger.params['returnUserInfo'].value;
  var body = req.swagger.params['body'].value;
  User.usersUserIdCheck_contacts_use_whatsAppPOST(userId,returnUserInfo,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdDELETE = function usersUserIdDELETE (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdDELETE(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdFriendsGET = function usersUserIdFriendsGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdFriendsGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdGET = function usersUserIdGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var currentUserId = req.swagger.params['currentUserId'].value;
  User.usersUserIdGET(userId,currentUserId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdInvite_to_WhatsAppPOST = function usersUserIdInvite_to_WhatsAppPOST (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var body = req.swagger.params['body'].value;
  User.usersUserIdInvite_to_WhatsAppPOST(userId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdLeaveChatIdPUT = function usersUserIdLeaveChatIdPUT (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var chatId = req.swagger.params['chatId'].value;
  User.usersUserIdLeaveChatIdPUT(userId,chatId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdMessagesDeliveredGET = function usersUserIdMessagesDeliveredGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdMessagesDeliveredGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdMessagesFavoriteGET = function usersUserIdMessagesFavoriteGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdMessagesFavoriteGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdMessagesGET = function usersUserIdMessagesGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdMessagesGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdMessagesSeenGET = function usersUserIdMessagesSeenGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdMessagesSeenGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdMessagesUnreadGET = function usersUserIdMessagesUnreadGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdMessagesUnreadGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdNotificationsGlobalPATCH = function usersUserIdNotificationsGlobalPATCH (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var unread = req.swagger.params['unread'].value;
  var delivered = req.swagger.params['delivered'].value;
  var seen = req.swagger.params['seen'].value;
  var nonanswered = req.swagger.params['nonanswered'].value;
  User.usersUserIdNotificationsGlobalPATCH(userId,unread,delivered,seen,nonanswered)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdPUT = function usersUserIdPUT (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var body = req.swagger.params['body'].value;
  User.usersUserIdPUT(userId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.usersUserIdPrivategroup_chatsGET = function usersUserIdPrivategroup_chatsGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  User.usersUserIdPrivategroup_chatsGET(userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
