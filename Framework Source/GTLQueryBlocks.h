/* This file was generated by the ServiceGenerator.
 * The ServiceGenerator is Copyright (c) 2016 Google Inc.
 */

//
//  GTLQueryBlocks.h
//

// ----------------------------------------------------------------------------
// NOTE: This file is generated from Google APIs Discovery Service.
// Service:
//   blocks/v1
// Description:
//   Square 1 API
// Classes:
//   GTLQueryBlocks (3 custom class methods, 4 custom properties)

#if GTL_BUILT_AS_FRAMEWORK
  #import "GTL/GTLQuery.h"
#else
  #import "GTLQuery.h"
#endif

@interface GTLQueryBlocks : GTLQuery

//
// Parameters valid on all methods.
//

// Selector specifying which fields to include in a partial response.
@property (nonatomic, copy) NSString *fields;

//
// Method-specific parameters; see the comments below for more information.
//
@property (nonatomic, copy) NSString *ownerid;
@property (nonatomic, copy) NSString *targetid;
@property (nonatomic, copy) NSString *token;

#pragma mark - "blocks" methods
// These create a GTLQueryBlocks object.

// Method: blocks.blocks.block
//  Authorization scope(s):
//   kGTLAuthScopeBlocksUserinfoEmail
// Fetches a GTLBlocksIblock.
+ (instancetype)queryForBlocksBlockWithOwnerid:(NSString *)ownerid
                                      targetid:(NSString *)targetid
                                         token:(NSString *)token;

// Method: blocks.blocks.list
//  Authorization scope(s):
//   kGTLAuthScopeBlocksUserinfoEmail
// Fetches a GTLBlocksIlist.
+ (instancetype)queryForBlocksListWithOwnerid:(NSString *)ownerid
                                     targetid:(NSString *)targetid
                                        token:(NSString *)token;

// Method: blocks.blocks.unblock
//  Authorization scope(s):
//   kGTLAuthScopeBlocksUserinfoEmail
// Fetches a GTLBlocksIunblock.
+ (instancetype)queryForBlocksUnblockWithOwnerid:(NSString *)ownerid
                                        targetid:(NSString *)targetid
                                           token:(NSString *)token;

@end